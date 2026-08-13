.class public abstract Lt8/k;
.super Lt8/g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lt8/k$a;,
        Lt8/k$b;
    }
.end annotation


# static fields
.field public static final b:Lt8/k$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lt8/k$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lt8/k$a;-><init>(Ly7/k;)V

    sput-object v0, Lt8/k;->b:Lt8/k$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    sget-object v0, Li7/M;->a:Li7/M;

    invoke-direct {p0, v0}, Lt8/g;-><init>(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lt8/k;->c()Li7/M;

    move-result-object v0

    return-object v0
.end method

.method public c()Li7/M;
    .locals 1

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method
