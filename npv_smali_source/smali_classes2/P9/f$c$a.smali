.class public final LP9/f$c$a;
.super LP9/f$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LP9/f$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, LP9/f$c;-><init>()V

    return-void
.end method


# virtual methods
.method public b(LP9/i;)V
    .locals 2

    const-string v0, "stream"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LP9/b;->L:LP9/b;

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, LP9/i;->d(LP9/b;Ljava/io/IOException;)V

    return-void
.end method
