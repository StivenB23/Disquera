
function eliminarGenero(id){
    let idGenero=id;
    Swal.fire({
        title: '¿Seguro que desea eliminar este genero?',
        text: "si lo elimina no podra restablecerla",
        icon: 'error',
        showCancelButton: true,
        confirmButtonColor: '#3085d6',
        cancelButtonColor: '#d33',
        confirmButtonText: 'Sí, eliminar'
      }).then((result) => {
        if (result.isConfirmed) {
            // enlace.href="@{/genero/delete/}"+idGenero;
            // alert(idGenero);
          window.location.href=`delete/${idGenero}`;
          Swal.fire({
            position: 'top-center',
            icon: 'success',
            title: 'Genero eliminado exitosamente',
            showConfirmButton: false,
            timer: 1500
          })
        }
      })
}

function eliminarCancion(id){
    let idCancion=id;
    Swal.fire({
        title: '¿Seguro que desea eliminar esta canción?',
        text: "si la elimina no podra restablecerla",
        icon: 'error',
        showCancelButton: true,
        confirmButtonColor: '#3085d6',
        cancelButtonColor: '#d33',
        confirmButtonText: 'Sí, eliminar'
      }).then((result) => {
        if (result.isConfirmed) {
          
          Swal.fire({
            position: 'top-center',
            icon: 'success',
            title: 'Canción eliminada exitosamente',
            showConfirmButton: false,
            timer: 1500,
            confirmButtonText: 'Ok'
          }).then((result)=>{
            window.location.href=`delete/${idCancion}`;
          })
        }
      })
}
function eliminarAlbum(id){
    let idAlbum=id;
    Swal.fire({
        title: '¿Seguro que desea eliminar este album?',
        text: "si lo elimina no podra restablecerla",
        icon: 'error',
        showCancelButton: true,
        confirmButtonColor: '#3085d6',
        cancelButtonColor: '#d33',
        confirmButtonText: 'Sí, eliminar'
      }).then((result) => {
        if (result.isConfirmed) {
          window.location.href=`delete/${idCancion}`;
          Swal.fire({
            position: 'top-center',
            icon: 'success',
            title: 'Album eliminado exitosamente',
            showConfirmButton: false,
            timer: 1500
          })
        }
      })
}
function editarGenero() {
  let btn=document.getElementById('formularioedit');
  Swal.fire({
      title: '¿Seguro que desea editar este Genero?',
      text: "si lo edita no podra restablecerla",
      icon: 'question',
      showCancelButton: true,
      confirmButtonColor: '#3085d6',
      cancelButtonColor: '#d33',
      confirmButtonText: 'Sí, editar'
    }).then((result) => {
      btn.submit()
      if (result.isConfirmed) {
        Swal.fire({
          position: 'top-center',
          icon: 'success',
          title: 'Genero editado exitosamente',
          showConfirmButton: false,
          timer: 1500
        })
      }
    })
}
function editarCancion() {
  let btn=document.getElementById('formularioeditCancion');
  Swal.fire({
      title: '¿Seguro que desea editar esta canción?',
      text: "si la edita no podra restablecerla",
      icon: 'question',
      showCancelButton: true,
      confirmButtonColor: '#3085d6',
      cancelButtonColor: '#d33',
      confirmButtonText: 'Sí, editar'
    }).then((result) => {
      btn.submit()
      if (result.isConfirmed) {
        Swal.fire({
          position: 'top-center',
          icon: 'success',
          title: 'Canción editada exitosamente',
          showConfirmButton: false,
          timer: 1500
        })
      }
    })
}
function editarAlbum() {
  let btn=document.getElementById('formularioeditAlbum');
  Swal.fire({
      title: '¿Seguro que desea editar este album?',
      text: "si lo edita no podra restablecerla",
      icon: 'question',
      showCancelButton: true,
      confirmButtonColor: '#3085d6',
      cancelButtonColor: '#d33',
      confirmButtonText: 'Sí, editar'
    }).then((result) => {
      btn.submit()
      if (result.isConfirmed) {
        Swal.fire({
          position: 'top-center',
          icon: 'success',
          title: 'Album editado exitosamente',
          showConfirmButton: false,
          timer: 1500
        })
      }
    })
}