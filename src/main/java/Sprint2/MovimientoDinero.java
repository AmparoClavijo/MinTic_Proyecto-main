package Sprint2;

public class MovimientoDinero {
    public class Transaccion {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long Id;

        @Column(name = "Concepto")
        private String Concepto;

        @Column(name = "Cantidad")
        private float Cantidad;

        public Transaccion(float cantidad) {
            Cantidad = cantidad;
        }
        //private Date createdAt;
        //private Date updatedAt;

        public long getId() {
            return Id;
        }
        public String getConcepto() {
            return Concepto;
        }
        public float getCantidad() {
            return Cantidad;
        }


        public void setId(long id) {
            Id = id;
        }

        public void setConcepto(String concepto) {
            Concepto = concepto;
        }

        public void setCantidad(float cantidad) {
            Cantidad = cantidad;
        }
    }


}
