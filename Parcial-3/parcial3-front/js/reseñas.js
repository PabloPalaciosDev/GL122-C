let reseñas = [];

function ObtenerReseñas(){
    fetch("http://localhost:8080/reseñas/all").
    then(resultado =>{
        resultado.json().then(json =>{
            reseñas = json;
            console.log(reseñas);
            ImprimirReseñas();
        })
    })
}

function ImprimirReseñas(){
    let contenedor = document.getElementById("reseñas-contenedor");
    reseñas.forEach(reseñas => {
        contenedor.innerHTML += MapearReseñas(reseñas);
    });
}

function MapearReseñas(reseñas){
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
</div>`;
}