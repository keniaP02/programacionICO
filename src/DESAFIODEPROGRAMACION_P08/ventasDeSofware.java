package DESAFIODEPROGRAMACION_P08;

public class ventasDeSofware{
        private int UnidadesVendidas;

        public ventasDeSofware(int unidades){
            this.UnidadesVendidas = unidades;
        }
        public double obtenerTotalVenta(){
            double porcentajeDescuento = 0;
            if (UnidadesVendidas >= 10 && UnidadesVendidas <=19){
                porcentajeDescuento = 20;
            } else if (UnidadesVendidas >=20 && UnidadesVendidas <=49){
                porcentajeDescuento = 30;
            }else if (UnidadesVendidas >= 50 && UnidadesVendidas <=99){
                porcentajeDescuento = 40;
            }else if (UnidadesVendidas >=100){
                porcentajeDescuento = 50;
            }
            double totalVenta;
            totalVenta = UnidadesVendidas * 99 - (UnidadesVendidas * 99) * porcentajeDescuento / 100;
            return totalVenta;
        }
}
