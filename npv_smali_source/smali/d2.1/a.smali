.class public final Ld2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ld2/a;

.field private static final b:LV/O0;

.field public static final c:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ld2/a;

    invoke-direct {v0}, Ld2/a;-><init>()V

    sput-object v0, Ld2/a;->a:Ld2/a;

    sget-object v0, Ld2/a$a;->D:Ld2/a$a;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v2, v0, v1, v2}, LV/y;->d(LV/u1;Lx7/a;ILjava/lang/Object;)LV/O0;

    move-result-object v0

    sput-object v0, Ld2/a;->b:LV/O0;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)Landroidx/lifecycle/Y;
    .locals 3

    .prologue
    const v0, -0x22d19e38

    invoke-interface {p1, v0}, LV/n;->f(I)V

    invoke-static {}, LV/q;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner.<get-current> (LocalViewModelStoreOwner.kt:38)"

    invoke-static {v0, p2, v1, v2}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object p2, Ld2/a;->b:LV/O0;

    invoke-interface {p1, p2}, LV/n;->n(LV/w;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroidx/lifecycle/Y;

    if-nez p2, :cond_1

    const/4 p2, 0x0

    invoke-static {p1, p2}, Ld2/b;->a(LV/n;I)Landroidx/lifecycle/Y;

    move-result-object p2

    :cond_1
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, LV/q;->P()V

    :cond_2
    invoke-interface {p1}, LV/n;->P()V

    return-object p2
.end method

.method public final b(Landroidx/lifecycle/Y;)LV/P0;
    .locals 1

    const-string v0, "viewModelStoreOwner"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ld2/a;->b:LV/O0;

    invoke-virtual {v0, p1}, LV/O0;->d(Ljava/lang/Object;)LV/P0;

    move-result-object p1

    return-object p1
.end method
