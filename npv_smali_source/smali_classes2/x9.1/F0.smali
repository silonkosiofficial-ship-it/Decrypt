.class public final Lx9/F0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt9/b;


# static fields
.field public static final a:Lx9/F0;

.field private static final b:Lv9/f;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lx9/F0;

    invoke-direct {v0}, Lx9/F0;-><init>()V

    sput-object v0, Lx9/F0;->a:Lx9/F0;

    sget-object v0, Ly7/e;->a:Ly7/e;

    invoke-static {v0}, Lu9/a;->y(Ly7/e;)Lt9/b;

    move-result-object v0

    const-string v1, "kotlin.UByte"

    invoke-static {v1, v0}, Lx9/G;->a(Ljava/lang/String;Lt9/b;)Lv9/f;

    move-result-object v0

    sput-object v0, Lx9/F0;->b:Lv9/f;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lv9/f;
    .locals 1

    sget-object v0, Lx9/F0;->b:Lv9/f;

    return-object v0
.end method

.method public bridge synthetic b(Lw9/h;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lx9/F0;->f(Lw9/h;)B

    move-result p1

    invoke-static {p1}, Li7/C;->e(B)Li7/C;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic e(Lw9/j;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Li7/C;

    invoke-virtual {p2}, Li7/C;->o()B

    move-result p2

    invoke-virtual {p0, p1, p2}, Lx9/F0;->g(Lw9/j;B)V

    return-void
.end method

.method public f(Lw9/h;)B
    .locals 1

    const-string v0, "decoder"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lx9/F0;->a()Lv9/f;

    move-result-object v0

    invoke-interface {p1, v0}, Lw9/h;->p(Lv9/f;)Lw9/h;

    move-result-object p1

    invoke-interface {p1}, Lw9/h;->y()B

    move-result p1

    invoke-static {p1}, Li7/C;->g(B)B

    move-result p1

    return p1
.end method

.method public g(Lw9/j;B)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lx9/F0;->a()Lv9/f;

    move-result-object v0

    invoke-interface {p1, v0}, Lw9/j;->w(Lv9/f;)Lw9/j;

    move-result-object p1

    invoke-interface {p1, p2}, Lw9/j;->j(B)V

    return-void
.end method
