  
  function afficher(department) {
    
    const allContents = document.querySelectorAll('.content-section');
    allContents.forEach(function(content) {
      content.style.display = 'none';
    });


    const departmentContenu = document.getElementById(department);
    if (departmentContenu) {
      departmentContenu.style.display = 'block';
    }

  
  }
  
 
  