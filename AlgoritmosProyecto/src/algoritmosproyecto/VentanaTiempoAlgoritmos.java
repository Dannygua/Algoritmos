
package algoritmosproyecto;


public class VentanaTiempoAlgoritmos extends javax.swing.JFrame {

    VentanaInicio window = new VentanaInicio ();

    public VentanaTiempoAlgoritmos() {
        initComponents();
    }
    
   public static void Bucketsort(int[] a, int maxVal) {
       
      int [] bucket=new int[maxVal+1];
 
      for (int i=0; i<bucket.length; i++) {
         bucket[i]=0;
      }
 
      for (int i=0; i<a.length; i++) {
         bucket[a[i]]++;
      }
 
      int outPos=0;
      for (int i=0; i<bucket.length; i++) {
         for (int j=0; j<bucket[i]; j++) {
            a[outPos++]=i;
         }
      }
      

   }
   
       public static void mergeSort(int array[]){
    int [] tmp = new int[array.length];
    mergeSort(array, tmp, 0, array.length-1);
}
        private static void mergeSort(int[] a, int[] tmp,int left, int right){
    if(left < right){
        int centre = (left + right)/2;
        mergeSort(a, tmp, left, centre);
        mergeSort(a, tmp, centre+1, right);
        merge(a, tmp, left, centre+1, right);
    }
}
        private static void merge(int [] a, int [] tmp, int left, int right, int rend){
    int lend = right-1;
    int tpos = left; int lbeg = left;
 
    while(left <= lend && right <= rend){
         if(a[left] < a[right]){
               tmp[tpos++] = a[left++];
         }else{
               tmp[tpos++] = a[right++];
         }
    }
    while(left <= lend){
         tmp[tpos++] = a[left++];
    }
    while(right <= rend){
         tmp[tpos++] = a[right++];
    }
    for(tpos = lbeg; tpos <= rend; tpos++){
         a[tpos] = tmp[tpos];
    }
}
        
   public static void shell(int A[]){
       
       long inicio =System.nanoTime();
   int salto, aux, i;
   boolean cambios;
   for(salto=A.length/2; salto!=0; salto/=2){
           cambios=true;
           while(cambios){ // Mientras se intercambie algún elemento
                       cambios=false;
                       for(i=salto; i< A.length; i++) // se da una pasada
                               if(A[i-salto]>A[i]){ // y si están desordenados
                                     aux=A[i]; // se reordenan
                                     A[i]=A[i-salto];
                                     A[i-salto]=aux;
                                     cambios=true; // y se marca como cambio.
                               }
                        }
            }
   
}
   
    private static int N;

    /* Sort Function */

    public static void heapsort(int arr[])
    {       
        heapify(arr);        
        for (int i = N; i > 0; i--)
        {
            swap(arr,0, i);
            N = N-1;
            maxheap(arr, 0);
        }

    }     
    /* Function to build a heap */   

    public static void heapify(int arr[])

    {
        N = arr.length-1;
        for (int i = N/2; i >= 0; i--)
            maxheap(arr, i);        
    }

    /* Function to swap largest element in heap */        

    public static void maxheap(int arr[], int i)

    { 
        int left = 2*i ;
        int right = 2*i + 1;
        int max = i;
        if (left <= N && arr[left] > arr[i])
            max = left;
        if (right <= N && arr[right] > arr[max])        
            max = right;

        if (max != i)

        {

            swap(arr, i, max);
           maxheap(arr, max);
        }
    }    
    /* Function to swap two numbers in an array */

    public static void swap(int arr[], int i, int j)
    {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp; 
    }
    
    
    
public static void quicksort(int A[], int izq, int der) {
        

        
  int pivote=A[izq]; // tomamos primer elemento como pivote
  int i=izq; // i realiza la búsqueda de izquierda a derecha
  int j=der; // j realiza la búsqueda de derecha a izquierda
  int aux;
 
  while(i<j){            // mientras no se crucen las búsquedas
     while(A[i]<=pivote && i<j) i++; // busca elemento mayor que pivote
     while(A[j]>pivote) j--;         // busca elemento menor que pivote
     if (i<j) {                      // si no se han cruzado                      
         aux= A[i];                  // los intercambia
         A[i]=A[j];
         A[j]=aux;
     }
   }
   A[izq]=A[j]; // se coloca el pivote en su lugar de forma que tendremos
   A[j]=pivote; // los menores a su izquierda y los mayores a su derecha
   if(izq<j-1)
      quicksort(A,izq,j-1); // ordenamos subarray izquierdo
   if(j+1 <der)
      quicksort(A,j+1,der); // ordenamos subarray derecho

}

    public static void radixSort(int[] arr){
        if(arr.length == 0)
            return;
        int[][] np = new int[arr.length][2];
        int[] q = new int[0x100];
        int i,j,k,l,f = 0;
        for(k=0;k<4;k++){
            for(i=0;i<(np.length-1);i++)
                np[i][1] = i+1;
            np[i][1] = -1;
            for(i=0;i<q.length;i++)
                q[i] = -1;
            for(f=i=0;i<arr.length;i++){
                j = ((0xFF<<(k<<3))&arr[i])>>(k<<3);
                if(q[j] == -1)
                    l = q[j] = f;
                else{
                    l = q[j];
                    while(np[l][1] != -1)
                        l = np[l][1];
                    np[l][1] = f;
                    l = np[l][1];
                }
                f = np[f][1];
                np[l][0] = arr[i];
                np[l][1] = -1;
            }
            for(l=q[i=j=0];i<0x100;i++)
                for(l=q[i];l!=-1;l=np[l][1])
                        arr[j++] = np[l][0];
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVolver = new javax.swing.JButton();
        BoxAlgoritmos = new javax.swing.JComboBox<>();
        txtAlgoritmos = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnVolver.setBackground(new java.awt.Color(153, 153, 153));
        btnVolver.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        btnVolver.setText("BACK");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 500, -1, -1));

        BoxAlgoritmos.setBackground(new java.awt.Color(153, 153, 153));
        BoxAlgoritmos.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        BoxAlgoritmos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bucketsort", "MergeSort", "Shell", "Heapsort", "Quicksort", "Radix" }));
        BoxAlgoritmos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoxAlgoritmosActionPerformed(evt);
            }
        });
        getContentPane().add(BoxAlgoritmos, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, -1, -1));

        txtAlgoritmos.setBackground(new java.awt.Color(153, 153, 153));
        txtAlgoritmos.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        txtAlgoritmos.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(txtAlgoritmos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 250, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("ALGORITMOS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("TIEMPO DE EJECUCION");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/universe.gif"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
     
        dispose();
        
        window.setVisible(true);
        window.setLocationRelativeTo(null); 
    }//GEN-LAST:event_btnVolverActionPerformed

    private void BoxAlgoritmosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoxAlgoritmosActionPerformed
    
    int op=BoxAlgoritmos.getSelectedIndex();
         switch (op){

            case 0:
    int maxVal=5;
    int [] data= {5,3,0,2,4,1,0,5,2,3,1,4}; 
      
    long inicio =System.nanoTime();
    Bucketsort(data,maxVal);
   long fin = System.nanoTime();
   double dif = (double)(fin - inicio)*1.0e-9;
    String totalString = String.valueOf(dif);
               
                txtAlgoritmos.setText(totalString+ " s");
                break;               
            case 1:
    int[ ] A = {45, 23, 11, 9};
    long inicio2 =System.nanoTime();
    mergeSort (A);
   long fin2 = System.nanoTime();
   double dif2 = (double)(fin2 - inicio2)*1.0e-9;
       String totalString2 = String.valueOf(dif2);
   
                txtAlgoritmos.setText(totalString2+ " s");
                break;
               
            case 2:
    int[ ] A2 = {45, 23, 11, 9};
    int izq =0;
    int der =(A2.length-1);
        long inicio3 =System.nanoTime();
    shell (A2);
       long fin3 = System.nanoTime();
   double dif3 = (double)(fin3 - inicio3)*1.0e-9;
   String totalString3 = String.valueOf(dif3);
                txtAlgoritmos.setText(totalString3+ " s");
                break;            
            case 3:
                int[ ] arr = {45, 23, 11, 9};

        long inicio4 =System.nanoTime();
        heapsort(arr);
        long fin4 = System.nanoTime();
        double dif4 = (double)(fin4 - inicio4)*1.0e-9;
        String totalString4 = String.valueOf(dif4);     
        txtAlgoritmos.setText(totalString4+ " s");
                break;            
            case 4:
       int[ ] A4 = {45, 23, 11, 9};
       int izqui =0;
       int dere =(A4.length-1);
       long inicio5 =System.nanoTime();
       quicksort (A4,izqui,dere);
       long fin5 = System.nanoTime();
       double dif5 = (double)(fin5 - inicio5)*1.0e-9;
       String totalString5 = String.valueOf(dif5);          
       txtAlgoritmos.setText(totalString5+ " s");
                break;
                
            case 5:
        int[ ] A6 = {45, 23, 11, 9};
        long inicio6 =System.nanoTime();
        radixSort (A6);
        long fin6 = System.nanoTime();
        double dif6 = (double)(fin6 - inicio6)*1.0e-9;                
        String totalString6 = String.valueOf(dif6);          
        txtAlgoritmos.setText(totalString6+ " s");
                break;
                
                
                } 
        
    }//GEN-LAST:event_BoxAlgoritmosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> BoxAlgoritmos;
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtAlgoritmos;
    // End of variables declaration//GEN-END:variables
}
