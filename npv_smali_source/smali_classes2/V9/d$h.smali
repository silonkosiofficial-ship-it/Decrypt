.class public final LV9/d$h;
.super LL9/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LV9/d;->w()Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic e:LV9/d;


# direct methods
.method public constructor <init>(Ljava/lang/String;ZLV9/d;)V
    .locals 0

    iput-object p3, p0, LV9/d$h;->e:LV9/d;

    invoke-direct {p0, p1, p2}, LL9/a;-><init>(Ljava/lang/String;Z)V

    return-void
.end method


# virtual methods
.method public f()J
    .locals 2

    iget-object v0, p0, LV9/d$h;->e:LV9/d;

    invoke-virtual {v0}, LV9/d;->cancel()V

    const-wide/16 v0, -0x1

    return-wide v0
.end method
