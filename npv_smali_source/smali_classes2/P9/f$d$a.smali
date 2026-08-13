.class public final LP9/f$d$a;
.super LL9/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LP9/f$d;->x(ZLP9/m;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic e:LP9/f;

.field final synthetic f:Ly7/O;


# direct methods
.method public constructor <init>(Ljava/lang/String;ZLP9/f;Ly7/O;)V
    .locals 0

    iput-object p3, p0, LP9/f$d$a;->e:LP9/f;

    iput-object p4, p0, LP9/f$d$a;->f:Ly7/O;

    invoke-direct {p0, p1, p2}, LL9/a;-><init>(Ljava/lang/String;Z)V

    return-void
.end method


# virtual methods
.method public f()J
    .locals 3

    iget-object v0, p0, LP9/f$d$a;->e:LP9/f;

    invoke-virtual {v0}, LP9/f;->E0()LP9/f$c;

    move-result-object v0

    iget-object v1, p0, LP9/f$d$a;->e:LP9/f;

    iget-object v2, p0, LP9/f$d$a;->f:Ly7/O;

    iget-object v2, v2, Ly7/O;->C:Ljava/lang/Object;

    check-cast v2, LP9/m;

    invoke-virtual {v0, v1, v2}, LP9/f$c;->a(LP9/f;LP9/m;)V

    const-wide/16 v0, -0x1

    return-wide v0
.end method
