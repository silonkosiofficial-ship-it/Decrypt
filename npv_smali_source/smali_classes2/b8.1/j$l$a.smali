.class final Lb8/j$l$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb8/j$l;->a()LE8/j;
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

    iput-object p1, p0, Lb8/j$l$a;->D:Lb8/j;

    iput-object p2, p0, Lb8/j$l$a;->E:Le8/n;

    iput-object p3, p0, Lb8/j$l$a;->F:Ly7/O;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Lt8/g;
    .locals 3

    iget-object v0, p0, Lb8/j$l$a;->D:Lb8/j;

    invoke-virtual {v0}, Lb8/j;->w()La8/g;

    move-result-object v0

    invoke-virtual {v0}, La8/g;->a()La8/b;

    move-result-object v0

    invoke-virtual {v0}, La8/b;->g()LY7/f;

    move-result-object v0

    iget-object v1, p0, Lb8/j$l$a;->E:Le8/n;

    iget-object v2, p0, Lb8/j$l$a;->F:Ly7/O;

    iget-object v2, v2, Ly7/O;->C:Ljava/lang/Object;

    check-cast v2, LO7/U;

    invoke-interface {v0, v1, v2}, LY7/f;->a(Le8/n;LO7/U;)Lt8/g;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lb8/j$l$a;->a()Lt8/g;

    move-result-object v0

    return-object v0
.end method
