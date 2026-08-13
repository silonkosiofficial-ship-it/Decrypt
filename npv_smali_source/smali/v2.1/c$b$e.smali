.class final Lv2/c$b$e;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lv2/c$b;->r(Lx7/l;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lv2/c$b;

.field final synthetic E:Lx7/l;


# direct methods
.method constructor <init>(Lv2/c$b;Lx7/l;)V
    .locals 0

    iput-object p1, p0, Lv2/c$b$e;->D:Lv2/c$b;

    iput-object p2, p0, Lv2/c$b$e;->E:Lx7/l;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lz2/d;)Ljava/lang/Object;
    .locals 1

    const-string v0, "db"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lv2/c$b$e;->D:Lv2/c$b;

    invoke-static {v0}, Lv2/c$b;->f(Lv2/c$b;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lz2/d;->J(Ljava/lang/String;)Lz2/h;

    move-result-object p1

    iget-object v0, p0, Lv2/c$b$e;->D:Lv2/c$b;

    invoke-static {v0, p1}, Lv2/c$b;->a(Lv2/c$b;Lz2/f;)V

    iget-object v0, p0, Lv2/c$b$e;->E:Lx7/l;

    invoke-interface {v0, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz2/d;

    invoke-virtual {p0, p1}, Lv2/c$b$e;->a(Lz2/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
