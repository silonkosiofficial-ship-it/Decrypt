.class public final Lz9/e$b;
.super Lw9/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz9/e;->u0(Ljava/lang/String;)Lz9/e$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private final a:LA9/b;

.field final synthetic b:Lz9/e;

.field final synthetic c:Ljava/lang/String;


# direct methods
.method constructor <init>(Lz9/e;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lz9/e$b;->b:Lz9/e;

    iput-object p2, p0, Lz9/e$b;->c:Ljava/lang/String;

    invoke-direct {p0}, Lw9/b;-><init>()V

    invoke-virtual {p1}, Lz9/e;->z()Ly9/b;

    move-result-object p1

    invoke-virtual {p1}, Ly9/b;->f()LA9/b;

    move-result-object p1

    iput-object p1, p0, Lz9/e$b;->a:LA9/b;

    return-void
.end method


# virtual methods
.method public A(I)V
    .locals 0

    invoke-static {p1}, Li7/E;->g(I)I

    move-result p1

    invoke-static {p1}, Lz9/f;->a(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lz9/e$b;->I(Ljava/lang/String;)V

    return-void
.end method

.method public D(J)V
    .locals 0

    invoke-static {p1, p2}, Li7/G;->g(J)J

    move-result-wide p1

    invoke-static {p1, p2}, Lz9/g;->a(J)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lz9/e$b;->I(Ljava/lang/String;)V

    return-void
.end method

.method public final I(Ljava/lang/String;)V
    .locals 9

    const-string v0, "s"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lz9/e$b;->b:Lz9/e;

    iget-object v1, p0, Lz9/e$b;->c:Ljava/lang/String;

    new-instance v8, Ly9/w;

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v2, v8

    move-object v3, p1

    invoke-direct/range {v2 .. v7}, Ly9/w;-><init>(Ljava/lang/Object;ZLv9/f;ILy7/k;)V

    invoke-virtual {v0, v1, v8}, Lz9/e;->v0(Ljava/lang/String;Ly9/i;)V

    return-void
.end method

.method public h(S)V
    .locals 0

    invoke-static {p1}, Li7/J;->g(S)S

    move-result p1

    invoke-static {p1}, Li7/J;->n(S)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lz9/e$b;->I(Ljava/lang/String;)V

    return-void
.end method

.method public j(B)V
    .locals 0

    invoke-static {p1}, Li7/C;->g(B)B

    move-result p1

    invoke-static {p1}, Li7/C;->n(B)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lz9/e$b;->I(Ljava/lang/String;)V

    return-void
.end method
