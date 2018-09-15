public class Usuario
{
     Correo _correo;
     Database _database; //Esta es una Clase Database que tiene la función "Save" para guardar al usuario como objeto dentro de la BDD.

     public Usuario(Correo correo)
     {
         _usuario = correo;
     }
     public void Register(string email, string password)
     {
          if (!_usuario.ValidarCorreo(email))
              throw new ValidationException("Email is not an email!");

         Usuario u = new u(email, password);
         _database.Save(u);

         correo.EnviarCorreo(new MensajeEmail("mysite@nowhere.com", email){Subject="HEllo fool!"});
     }
}

public class Correo
{
     public bool ValidarCorreo(string email)
     {
     //Validación para saber si es un correo o no.
         return email.Contains("@");
     }

     public bool EnviarCorreo(MensajeEmail msj)
     {
     //cliente de servidor de correos.
         _smtpClient.Enviar(msj);
     }
}
