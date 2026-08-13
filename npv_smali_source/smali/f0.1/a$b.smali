.class final Lf0/a$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf0/a;->Q(Lx7/l;Lx7/l;)Lf0/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lx7/l;

.field final synthetic E:Lx7/l;


# direct methods
.method constructor <init>(Lx7/l;Lx7/l;)V
    .locals 0

    iput-object p1, p0, Lf0/a$b;->D:Lx7/l;

    iput-object p2, p0, Lf0/a$b;->E:Lx7/l;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lf0/n;)Lf0/c;
    .locals 4

    .prologue
    invoke-static {}, Lf0/p;->I()Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    invoke-static {}, Lf0/p;->i()I

    move-result v1

    add-int/lit8 v2, v1, 0x1

    invoke-static {v2}, Lf0/p;->u(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    iget-object v0, p0, Lf0/a$b;->D:Lx7/l;

    iget-object v2, p0, Lf0/a$b;->E:Lx7/l;

    new-instance v3, Lf0/c;

    invoke-direct {v3, v1, p1, v0, v2}, Lf0/c;-><init>(ILf0/n;Lx7/l;Lx7/l;)V

    return-object v3

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lf0/n;

    invoke-virtual {p0, p1}, Lf0/a$b;->a(Lf0/n;)Lf0/c;

    move-result-object p1

    return-object p1
.end method
