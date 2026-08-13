.class abstract LH2/x$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LH2/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# static fields
.field static final a:LH2/z;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, LH2/x;->a()LH2/z;

    move-result-object v0

    sput-object v0, LH2/x$a;->a:LH2/z;

    return-void
.end method
