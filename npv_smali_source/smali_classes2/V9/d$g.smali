.class public final LV9/d$g;
.super LL9/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LV9/d;->r(Ljava/lang/String;LV9/d$d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic e:LV9/d;

.field final synthetic f:J


# direct methods
.method public constructor <init>(Ljava/lang/String;LV9/d;J)V
    .locals 0

    iput-object p2, p0, LV9/d$g;->e:LV9/d;

    iput-wide p3, p0, LV9/d$g;->f:J

    const/4 p2, 0x2

    const/4 p3, 0x0

    const/4 p4, 0x0

    invoke-direct {p0, p1, p4, p2, p3}, LL9/a;-><init>(Ljava/lang/String;ZILy7/k;)V

    return-void
.end method


# virtual methods
.method public f()J
    .locals 2

    iget-object v0, p0, LV9/d$g;->e:LV9/d;

    invoke-virtual {v0}, LV9/d;->x()V

    iget-wide v0, p0, LV9/d$g;->f:J

    return-wide v0
.end method
