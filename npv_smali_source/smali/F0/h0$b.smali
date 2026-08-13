.class final LF0/h0$b;
.super LD0/X;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF0/h0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation


# direct methods
.method public constructor <init>(II)V
    .locals 0

    invoke-direct {p0}, LD0/X;-><init>()V

    invoke-static {p1, p2}, LY0/u;->a(II)J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, LD0/X;->Y0(J)V

    return-void
.end method


# virtual methods
.method public Q(LD0/a;)I
    .locals 0

    const/high16 p1, -0x80000000

    return p1
.end method

.method protected R0(JFLx7/l;)V
    .locals 0

    return-void
.end method
