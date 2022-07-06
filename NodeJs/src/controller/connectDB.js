/**
 * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
 * @param MongoClient Se hace la conexion a la base de datos de mongoDB a traves de la libreria MongoClient
 */
 const MongoClient = require('mongodb').MongoClient;

 /**
  * @param uri Se guarda la variable encargada de hacer la conexion con la base de datos.
  */
 const uri = `mongodb+srv://${process.env.USER}:${process.env.PASSWORD}@cluster0.ueatq.mongodb.net/${process.env.DBNAME}?retryWrites=true&w=majority`
 let connection
 /**
  * @param connectDB Hace la conexion con la base de datos y devuelve si logro conectarse o no a ella.
  * @returns 
  */
 async function connectDB() {
     if(connection) return connection
     let client
     try{
         client = await MongoClient.connect(uri,{
             useUnifiedTopology: true 
         })
         connection = client.db(process.env.DBNAME)
         console.log("Conexion a Base de Datos Exitosa")
     }
     catch(error){
         console.log("No se pudo acceder a la Base de Datos", uri, error)
         process.exit()
     }
     return connection
 }
 /**
  * Se exporta el modulo connectDB para ser usado por otros archivos.
  */
 module.exports=connectDB;