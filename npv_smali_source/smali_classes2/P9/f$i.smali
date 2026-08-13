.class public final LP9/f$i;
.super LL9/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LP9/f;->y1()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic e:LP9/f;


# direct methods
.method public constructor <init>(Ljava/lang/String;ZLP9/f;)V
    .locals 0

    iput-object p3, p0, LP9/f$i;->e:LP9/f;

    invoke-direct {p0, p1, p2}, LL9/a;-><init>(Ljava/lang/String;Z)V

    return-void
.end method


# virtual methods
.method public f()J
    .locals 3

    iget-object v0, p0, LP9/f$i;->e:LP9/f;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-virtual {v0, v1, v2, v1}, LP9/f;->H1(ZII)V

    const-wide/16 v0, -0x1

    return-wide v0
.end method
