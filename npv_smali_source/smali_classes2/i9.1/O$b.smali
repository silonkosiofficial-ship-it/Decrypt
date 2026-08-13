.class final synthetic Li9/O$b;
.super Ly7/A;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li9/O;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1000
    name = null
.end annotation


# static fields
.field public static final K:Li9/O$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Li9/O$b;

    invoke-direct {v0}, Li9/O$b;-><init>()V

    sput-object v0, Li9/O$b;->K:Li9/O$b;

    return-void
.end method

.method constructor <init>()V
    .locals 4

    const-string v0, "getFractionOfSecond()Lkotlinx/datetime/internal/DecimalFraction;"

    const/4 v1, 0x0

    const-class v2, Li9/N;

    const-string v3, "fractionOfSecond"

    invoke-direct {p0, v2, v3, v0, v1}, Ly7/A;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Li9/N;

    invoke-interface {p1}, Li9/N;->p()Lj9/a;

    move-result-object p1

    return-object p1
.end method

.method public r(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Li9/N;

    check-cast p2, Lj9/a;

    invoke-interface {p1, p2}, Li9/N;->d(Lj9/a;)V

    return-void
.end method
