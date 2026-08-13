.class public final Lx9/H0;
.super Lx9/p0;
.source "SourceFile"

# interfaces
.implements Lt9/b;


# static fields
.field public static final c:Lx9/H0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lx9/H0;

    invoke-direct {v0}, Lx9/H0;-><init>()V

    sput-object v0, Lx9/H0;->c:Lx9/H0;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    sget-object v0, Li7/E;->D:Li7/E$a;

    invoke-static {v0}, Lu9/a;->t(Li7/E$a;)Lt9/b;

    move-result-object v0

    invoke-direct {p0, v0}, Lx9/p0;-><init>(Lt9/b;)V

    return-void
.end method


# virtual methods
.method protected A([I)I
    .locals 1

    const-string v0, "$this$collectionSize"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Li7/F;->M([I)I

    move-result p1

    return p1
.end method

.method protected B()[I
    .locals 1

    const/4 v0, 0x0

    invoke-static {v0}, Li7/F;->e(I)[I

    move-result-object v0

    return-object v0
.end method

.method protected C(Lw9/d;ILx9/G0;Z)V
    .locals 0

    const-string p4, "decoder"

    invoke-static {p1, p4}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p4, "builder"

    invoke-static {p3, p4}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lx9/p0;->a()Lv9/f;

    move-result-object p4

    invoke-interface {p1, p4, p2}, Lw9/d;->E(Lv9/f;I)Lw9/h;

    move-result-object p1

    invoke-interface {p1}, Lw9/h;->m()I

    move-result p1

    invoke-static {p1}, Li7/E;->g(I)I

    move-result p1

    invoke-virtual {p3, p1}, Lx9/G0;->e(I)V

    return-void
.end method

.method protected D([I)Lx9/G0;
    .locals 2

    const-string v0, "$this$toBuilder"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lx9/G0;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lx9/G0;-><init>([ILy7/k;)V

    return-object v0
.end method

.method protected E(Lw9/f;[II)V
    .locals 3

    .prologue
    const-string v0, "encoder"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "content"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p3, :cond_0

    invoke-virtual {p0}, Lx9/p0;->a()Lv9/f;

    move-result-object v1

    invoke-interface {p1, v1, v0}, Lw9/f;->u(Lv9/f;I)Lw9/j;

    move-result-object v1

    invoke-static {p2, v0}, Li7/F;->D([II)I

    move-result v2

    invoke-interface {v1, v2}, Lw9/j;->A(I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public bridge synthetic j(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Li7/F;

    invoke-virtual {p1}, Li7/F;->S()[I

    move-result-object p1

    invoke-virtual {p0, p1}, Lx9/H0;->A([I)I

    move-result p1

    return p1
.end method

.method public bridge synthetic m(Lw9/d;ILjava/lang/Object;Z)V
    .locals 0

    check-cast p3, Lx9/G0;

    invoke-virtual {p0, p1, p2, p3, p4}, Lx9/H0;->C(Lw9/d;ILx9/G0;Z)V

    return-void
.end method

.method public bridge synthetic p(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Li7/F;

    invoke-virtual {p1}, Li7/F;->S()[I

    move-result-object p1

    invoke-virtual {p0, p1}, Lx9/H0;->D([I)Lx9/G0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic w()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lx9/H0;->B()[I

    move-result-object v0

    invoke-static {v0}, Li7/F;->d([I)Li7/F;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic z(Lw9/f;Ljava/lang/Object;I)V
    .locals 0

    check-cast p2, Li7/F;

    invoke-virtual {p2}, Li7/F;->S()[I

    move-result-object p2

    invoke-virtual {p0, p1, p2, p3}, Lx9/H0;->E(Lw9/f;[II)V

    return-void
.end method
