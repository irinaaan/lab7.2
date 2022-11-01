public class KoreanSushiShop extends SushiShop {

        @Override
        public Sushi createSushi (SushiType type) {
            Sushi sushi = null;

            switch (type) {
                case NIGIRI:
                    sushi = new KoreanNigiri();
                    break;

                case MAKI:
                    sushi = new KoreanMaki();
                    break;

                case URAMAKI:
                    sushi = new KoreanUramaki();
                    break;

                case SASHIMI:
                    sushi = new KoreanSashimi();
                    break;

                case TEMAKI:
                    sushi = new KoreanTemaki();
                    break;
            }
            return sushi;
        }
}