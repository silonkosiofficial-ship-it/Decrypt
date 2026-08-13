.class public final LP3/q;
.super LP3/n;
.source "SourceFile"


# instance fields
.field private final c:LO3/e;


# direct methods
.method public constructor <init>(LO3/e;)V
    .locals 1

    const-string v0, "Method is not supported by connectionless client. APIs supporting connectionless client must not call this method."

    invoke-direct {p0, v0}, LP3/n;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, LP3/q;->c:LO3/e;

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/common/api/internal/b;)Lcom/google/android/gms/common/api/internal/b;
    .locals 1

    iget-object v0, p0, LP3/q;->c:LO3/e;

    invoke-virtual {v0, p1}, LO3/e;->g(Lcom/google/android/gms/common/api/internal/b;)Lcom/google/android/gms/common/api/internal/b;

    move-result-object p1

    return-object p1
.end method

.method public final c()Landroid/os/Looper;
    .locals 1

    iget-object v0, p0, LP3/q;->c:LO3/e;

    invoke-virtual {v0}, LO3/e;->l()Landroid/os/Looper;

    move-result-object v0

    return-object v0
.end method
