.class public final LP9/f$d$c;
.super LL9/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LP9/f$d;->p(ZII)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic e:LP9/f;

.field final synthetic f:I

.field final synthetic g:I


# direct methods
.method public constructor <init>(Ljava/lang/String;ZLP9/f;II)V
    .locals 0

    iput-object p3, p0, LP9/f$d$c;->e:LP9/f;

    iput p4, p0, LP9/f$d$c;->f:I

    iput p5, p0, LP9/f$d$c;->g:I

    invoke-direct {p0, p1, p2}, LL9/a;-><init>(Ljava/lang/String;Z)V

    return-void
.end method


# virtual methods
.method public f()J
    .locals 4

    iget-object v0, p0, LP9/f$d$c;->e:LP9/f;

    iget v1, p0, LP9/f$d$c;->f:I

    iget v2, p0, LP9/f$d$c;->g:I

    const/4 v3, 0x1

    invoke-virtual {v0, v3, v1, v2}, LP9/f;->H1(ZII)V

    const-wide/16 v0, -0x1

    return-wide v0
.end method
