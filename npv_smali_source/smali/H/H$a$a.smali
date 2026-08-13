.class final LH/H$a$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LH/H$a;->i(LS0/X;LS0/V;LS0/k;LS0/s;Lx7/l;Lx7/l;)LS0/d0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LS0/k;

.field final synthetic E:Lx7/l;

.field final synthetic F:Ly7/O;


# direct methods
.method constructor <init>(LS0/k;Lx7/l;Ly7/O;)V
    .locals 0

    iput-object p1, p0, LH/H$a$a;->D:LS0/k;

    iput-object p2, p0, LH/H$a$a;->E:Lx7/l;

    iput-object p3, p0, LH/H$a$a;->F:Ly7/O;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;)V
    .locals 4

    sget-object v0, LH/H;->a:LH/H$a;

    iget-object v1, p0, LH/H$a$a;->D:LS0/k;

    iget-object v2, p0, LH/H$a$a;->E:Lx7/l;

    iget-object v3, p0, LH/H$a$a;->F:Ly7/O;

    iget-object v3, v3, Ly7/O;->C:Ljava/lang/Object;

    check-cast v3, LS0/d0;

    invoke-virtual {v0, p1, v1, v2, v3}, LH/H$a;->g(Ljava/util/List;LS0/k;Lx7/l;LS0/d0;)V

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, LH/H$a$a;->a(Ljava/util/List;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
