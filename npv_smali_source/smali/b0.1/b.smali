.class public final Lb0/b;
.super Lj7/k;
.source "SourceFile"

# interfaces
.implements LY/g;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb0/b$a;
    }
.end annotation


# static fields
.field public static final G:Lb0/b$a;

.field public static final H:I

.field private static final I:Lb0/b;


# instance fields
.field private final D:Ljava/lang/Object;

.field private final E:Ljava/lang/Object;

.field private final F:La0/d;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lb0/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lb0/b$a;-><init>(Ly7/k;)V

    sput-object v0, Lb0/b;->G:Lb0/b$a;

    const/16 v0, 0x8

    sput v0, Lb0/b;->H:I

    new-instance v0, Lb0/b;

    sget-object v1, Lc0/c;->a:Lc0/c;

    sget-object v2, La0/d;->F:La0/d$a;

    invoke-virtual {v2}, La0/d$a;->a()La0/d;

    move-result-object v2

    invoke-direct {v0, v1, v1, v2}, Lb0/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;La0/d;)V

    sput-object v0, Lb0/b;->I:Lb0/b;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Ljava/lang/Object;La0/d;)V
    .locals 0

    invoke-direct {p0}, Lj7/k;-><init>()V

    iput-object p1, p0, Lb0/b;->D:Ljava/lang/Object;

    iput-object p2, p0, Lb0/b;->E:Ljava/lang/Object;

    iput-object p3, p0, Lb0/b;->F:La0/d;

    return-void
.end method

.method public static final synthetic g()Lb0/b;
    .locals 1

    sget-object v0, Lb0/b;->I:Lb0/b;

    return-object v0
.end method


# virtual methods
.method public add(Ljava/lang/Object;)LY/g;
    .locals 3

    .prologue
    iget-object v0, p0, Lb0/b;->F:La0/d;

    invoke-virtual {v0, p1}, La0/d;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    invoke-virtual {p0}, Lj7/b;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lb0/b;->F:La0/d;

    new-instance v1, Lb0/a;

    invoke-direct {v1}, Lb0/a;-><init>()V

    invoke-virtual {v0, p1, v1}, La0/d;->t(Ljava/lang/Object;Ljava/lang/Object;)La0/d;

    move-result-object v0

    new-instance v1, Lb0/b;

    invoke-direct {v1, p1, p1, v0}, Lb0/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;La0/d;)V

    return-object v1

    :cond_1
    iget-object v0, p0, Lb0/b;->E:Ljava/lang/Object;

    iget-object v1, p0, Lb0/b;->F:La0/d;

    invoke-virtual {v1, v0}, La0/d;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    check-cast v1, Lb0/a;

    iget-object v2, p0, Lb0/b;->F:La0/d;

    invoke-virtual {v1, p1}, Lb0/a;->e(Ljava/lang/Object;)Lb0/a;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, La0/d;->t(Ljava/lang/Object;Ljava/lang/Object;)La0/d;

    move-result-object v1

    new-instance v2, Lb0/a;

    invoke-direct {v2, v0}, Lb0/a;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v1, p1, v2}, La0/d;->t(Ljava/lang/Object;Ljava/lang/Object;)La0/d;

    move-result-object v0

    new-instance v1, Lb0/b;

    iget-object v2, p0, Lb0/b;->D:Ljava/lang/Object;

    invoke-direct {v1, v2, p1, v0}, Lb0/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;La0/d;)V

    return-object v1
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Lb0/b;->F:La0/d;

    invoke-virtual {v0, p1}, La0/d;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public e()I
    .locals 1

    iget-object v0, p0, Lb0/b;->F:La0/d;

    invoke-virtual {v0}, Lj7/f;->size()I

    move-result v0

    return v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 3

    new-instance v0, Lb0/c;

    iget-object v1, p0, Lb0/b;->D:Ljava/lang/Object;

    iget-object v2, p0, Lb0/b;->F:La0/d;

    invoke-direct {v0, v1, v2}, Lb0/c;-><init>(Ljava/lang/Object;Ljava/util/Map;)V

    return-object v0
.end method

.method public remove(Ljava/lang/Object;)LY/g;
    .locals 4

    .prologue
    iget-object v0, p0, Lb0/b;->F:La0/d;

    invoke-virtual {v0, p1}, La0/d;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb0/a;

    if-nez v0, :cond_0

    return-object p0

    :cond_0
    iget-object v1, p0, Lb0/b;->F:La0/d;

    invoke-virtual {v1, p1}, La0/d;->u(Ljava/lang/Object;)La0/d;

    move-result-object p1

    invoke-virtual {v0}, Lb0/a;->b()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lb0/a;->d()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    check-cast v1, Lb0/a;

    invoke-virtual {v0}, Lb0/a;->d()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0}, Lb0/a;->c()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v1, v3}, Lb0/a;->e(Ljava/lang/Object;)Lb0/a;

    move-result-object v1

    invoke-virtual {p1, v2, v1}, La0/d;->t(Ljava/lang/Object;Ljava/lang/Object;)La0/d;

    move-result-object p1

    :cond_1
    invoke-virtual {v0}, Lb0/a;->a()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {v0}, Lb0/a;->c()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    check-cast v1, Lb0/a;

    invoke-virtual {v0}, Lb0/a;->c()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0}, Lb0/a;->d()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v1, v3}, Lb0/a;->f(Ljava/lang/Object;)Lb0/a;

    move-result-object v1

    invoke-virtual {p1, v2, v1}, La0/d;->t(Ljava/lang/Object;Ljava/lang/Object;)La0/d;

    move-result-object p1

    :cond_2
    invoke-virtual {v0}, Lb0/a;->b()Z

    move-result v1

    if-nez v1, :cond_3

    invoke-virtual {v0}, Lb0/a;->c()Ljava/lang/Object;

    move-result-object v1

    goto :goto_0

    :cond_3
    iget-object v1, p0, Lb0/b;->D:Ljava/lang/Object;

    :goto_0
    invoke-virtual {v0}, Lb0/a;->a()Z

    move-result v2

    if-nez v2, :cond_4

    invoke-virtual {v0}, Lb0/a;->d()Ljava/lang/Object;

    move-result-object v0

    goto :goto_1

    :cond_4
    iget-object v0, p0, Lb0/b;->E:Ljava/lang/Object;

    :goto_1
    new-instance v2, Lb0/b;

    invoke-direct {v2, v1, v0, p1}, Lb0/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;La0/d;)V

    return-object v2
.end method
