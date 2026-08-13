.class final Lb8/j$l;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb8/j;->J(Le8/n;)LO7/U;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lb8/j;

.field final synthetic E:Le8/n;

.field final synthetic F:Ly7/O;


# direct methods
.method constructor <init>(Lb8/j;Le8/n;Ly7/O;)V
    .locals 0

    iput-object p1, p0, Lb8/j$l;->D:Lb8/j;

    iput-object p2, p0, Lb8/j$l;->E:Le8/n;

    iput-object p3, p0, Lb8/j$l;->F:Ly7/O;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()LE8/j;
    .locals 5

    iget-object v0, p0, Lb8/j$l;->D:Lb8/j;

    invoke-virtual {v0}, Lb8/j;->w()La8/g;

    move-result-object v0

    invoke-virtual {v0}, La8/g;->e()LE8/n;

    move-result-object v0

    new-instance v1, Lb8/j$l$a;

    iget-object v2, p0, Lb8/j$l;->D:Lb8/j;

    iget-object v3, p0, Lb8/j$l;->E:Le8/n;

    iget-object v4, p0, Lb8/j$l;->F:Ly7/O;

    invoke-direct {v1, v2, v3, v4}, Lb8/j$l$a;-><init>(Lb8/j;Le8/n;Ly7/O;)V

    invoke-interface {v0, v1}, LE8/n;->f(Lx7/a;)LE8/j;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lb8/j$l;->a()LE8/j;

    move-result-object v0

    return-object v0
.end method
