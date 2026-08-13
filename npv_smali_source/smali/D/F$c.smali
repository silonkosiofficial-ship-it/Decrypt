.class final LD/F$c;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD/F;->d(Ljava/lang/Object;Lx7/p;LV/n;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LD/F;

.field final synthetic E:Ljava/lang/Object;


# direct methods
.method constructor <init>(LD/F;Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, LD/F$c;->D:LD/F;

    iput-object p2, p0, LD/F$c;->E:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/N;)LV/M;
    .locals 2

    iget-object p1, p0, LD/F$c;->D:LD/F;

    invoke-static {p1}, LD/F;->g(LD/F;)Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    iget-object v0, p0, LD/F$c;->E:Ljava/lang/Object;

    invoke-interface {p1, v0}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    iget-object p1, p0, LD/F$c;->D:LD/F;

    iget-object v0, p0, LD/F$c;->E:Ljava/lang/Object;

    new-instance v1, LD/F$c$a;

    invoke-direct {v1, p1, v0}, LD/F$c$a;-><init>(LD/F;Ljava/lang/Object;)V

    return-object v1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/N;

    invoke-virtual {p0, p1}, LD/F$c;->a(LV/N;)LV/M;

    move-result-object p1

    return-object p1
.end method
