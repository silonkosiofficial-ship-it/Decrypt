.class final Lx/C$e;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx/C;-><init>(Lx/A;Lv/T;Lx/p;Lx/s;ZLy0/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lx/C;


# direct methods
.method constructor <init>(Lx/C;)V
    .locals 0

    iput-object p1, p0, Lx/C$e;->D:Lx/C;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(J)J
    .locals 3

    iget-object v0, p0, Lx/C$e;->D:Lx/C;

    invoke-static {v0}, Lx/C;->e(Lx/C;)Lx/w;

    move-result-object v0

    iget-object v1, p0, Lx/C$e;->D:Lx/C;

    invoke-static {v1}, Lx/C;->b(Lx/C;)I

    move-result v2

    invoke-static {v1, v0, p1, p2, v2}, Lx/C;->i(Lx/C;Lx/w;JI)J

    move-result-wide p1

    return-wide p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Ln0/g;

    invoke-virtual {p1}, Ln0/g;->v()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lx/C$e;->a(J)J

    move-result-wide v0

    invoke-static {v0, v1}, Ln0/g;->d(J)Ln0/g;

    move-result-object p1

    return-object p1
.end method
