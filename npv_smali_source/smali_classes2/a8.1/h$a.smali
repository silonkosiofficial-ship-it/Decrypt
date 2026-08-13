.class final La8/h$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La8/h;-><init>(La8/g;LO7/m;Le8/z;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:La8/h;


# direct methods
.method constructor <init>(La8/h;)V
    .locals 0

    iput-object p1, p0, La8/h$a;->D:La8/h;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Le8/y;)Lb8/n;
    .locals 5

    .prologue
    const-string v0, "typeParameter"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, La8/h$a;->D:La8/h;

    invoke-static {v0}, La8/h;->d(La8/h;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_0

    iget-object v1, p0, La8/h$a;->D:La8/h;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    new-instance v2, Lb8/n;

    invoke-static {v1}, La8/h;->b(La8/h;)La8/g;

    move-result-object v3

    invoke-static {v3, v1}, La8/a;->b(La8/g;La8/k;)La8/g;

    move-result-object v3

    invoke-static {v1}, La8/h;->c(La8/h;)LO7/m;

    move-result-object v4

    invoke-interface {v4}, LP7/a;->k()LP7/g;

    move-result-object v4

    invoke-static {v3, v4}, La8/a;->h(La8/g;LP7/g;)La8/g;

    move-result-object v3

    invoke-static {v1}, La8/h;->e(La8/h;)I

    move-result v4

    add-int/2addr v4, v0

    invoke-static {v1}, La8/h;->c(La8/h;)LO7/m;

    move-result-object v0

    invoke-direct {v2, v3, p1, v4, v0}, Lb8/n;-><init>(La8/g;Le8/y;ILO7/m;)V

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    return-object v2
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Le8/y;

    invoke-virtual {p0, p1}, La8/h$a;->a(Le8/y;)Lb8/n;

    move-result-object p1

    return-object p1
.end method
