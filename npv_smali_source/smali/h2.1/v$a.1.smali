.class final Lh2/v$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh2/v;->f(Lh2/s;Lh2/s;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lh2/v;

.field final synthetic E:Lh2/s;

.field final synthetic F:Lh2/s;


# direct methods
.method constructor <init>(Lh2/v;Lh2/s;Lh2/s;)V
    .locals 0

    iput-object p1, p0, Lh2/v$a;->D:Lh2/v;

    iput-object p2, p0, Lh2/v$a;->E:Lh2/s;

    iput-object p3, p0, Lh2/v$a;->F:Lh2/s;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lh2/g;)Lh2/g;
    .locals 3

    iget-object v0, p0, Lh2/v$a;->D:Lh2/v;

    iget-object v1, p0, Lh2/v$a;->E:Lh2/s;

    iget-object v2, p0, Lh2/v$a;->F:Lh2/s;

    invoke-static {v0, p1, v1, v2}, Lh2/v;->a(Lh2/v;Lh2/g;Lh2/s;Lh2/s;)Lh2/g;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lh2/g;

    invoke-virtual {p0, p1}, Lh2/v$a;->a(Lh2/g;)Lh2/g;

    move-result-object p1

    return-object p1
.end method
