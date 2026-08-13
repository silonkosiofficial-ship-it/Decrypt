.class public abstract LH9/A;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LH9/A$a;
    }
.end annotation


# static fields
.field public static final a:LH9/A$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LH9/A$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LH9/A$a;-><init>(Ly7/k;)V

    sput-object v0, LH9/A;->a:LH9/A$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a()J
.end method

.method public abstract b()LH9/w;
.end method

.method public c()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public d()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public abstract e(LX9/e;)V
.end method
