let reseñas = [];

function ObtenerReseñas(){
    fetch("http://localhost:8080/reseñas/all").
    then(resultado =>{
        resulttado.json().then(json =>{
            mascotas = json;
            console.log(reseñas);
        })
    })
}

function MapearReseñas(){
    let contenedor = document.getElementById("reseñas-contenedor");
    reseñas.forEach(element => {
        return `<div class="reseñas-info-cont">
        <div class="reseñas-info">
            <p>
                ${reseñas.comentario}
            </p>
            <h4>
                <img
                    src="${reseñas.foto}"
                    width="30px"
                    alt=""
                />${reseñas.nombre}, ${reseñas.rol}
            </h4>
        </div>
    </div>`
    });
}