.class final Lcom/google/android/gms/internal/ads/DH0;
.super Lcom/google/android/gms/internal/ads/yH0;
.source "SourceFile"


# static fields
.field public static final e:Ljava/lang/Object;


# instance fields
.field private final c:Ljava/lang/Object;

.field private final d:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/DH0;->e:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>(Lcom/google/android/gms/internal/ads/qm;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/yH0;-><init>(Lcom/google/android/gms/internal/ads/qm;)V

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/DH0;->c:Ljava/lang/Object;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/DH0;->d:Ljava/lang/Object;

    return-void
.end method

.method public static q(Lcom/google/android/gms/internal/ads/Q7;)Lcom/google/android/gms/internal/ads/DH0;
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/ads/DH0;

    new-instance v1, Lcom/google/android/gms/internal/ads/FH0;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/FH0;-><init>(Lcom/google/android/gms/internal/ads/Q7;)V

    sget-object p0, Lcom/google/android/gms/internal/ads/Ql;->o:Ljava/lang/Object;

    sget-object v2, Lcom/google/android/gms/internal/ads/DH0;->e:Ljava/lang/Object;

    invoke-direct {v0, v1, p0, v2}, Lcom/google/android/gms/internal/ads/DH0;-><init>(Lcom/google/android/gms/internal/ads/qm;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method public static r(Lcom/google/android/gms/internal/ads/qm;Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/DH0;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/DH0;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/internal/ads/DH0;-><init>(Lcom/google/android/gms/internal/ads/qm;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method static bridge synthetic s(Lcom/google/android/gms/internal/ads/DH0;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/DH0;->d:Ljava/lang/Object;

    return-object p0
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)I
    .locals 1

    .prologue
    sget-object v0, Lcom/google/android/gms/internal/ads/DH0;->e:Ljava/lang/Object;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/DH0;->d:Ljava/lang/Object;

    if-eqz v0, :cond_0

    move-object p1, v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/yH0;->b:Lcom/google/android/gms/internal/ads/qm;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/qm;->a(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public final d(ILcom/google/android/gms/internal/ads/pl;Z)Lcom/google/android/gms/internal/ads/pl;
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/yH0;->b:Lcom/google/android/gms/internal/ads/qm;

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/qm;->d(ILcom/google/android/gms/internal/ads/pl;Z)Lcom/google/android/gms/internal/ads/pl;

    iget-object p1, p2, Lcom/google/android/gms/internal/ads/pl;->b:Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/DH0;->d:Ljava/lang/Object;

    invoke-static {p1, v0}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    if-eqz p3, :cond_0

    sget-object p1, Lcom/google/android/gms/internal/ads/DH0;->e:Ljava/lang/Object;

    iput-object p1, p2, Lcom/google/android/gms/internal/ads/pl;->b:Ljava/lang/Object;

    :cond_0
    return-object p2
.end method

.method public final e(ILcom/google/android/gms/internal/ads/Ql;J)Lcom/google/android/gms/internal/ads/Ql;
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/yH0;->b:Lcom/google/android/gms/internal/ads/qm;

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/ads/qm;->e(ILcom/google/android/gms/internal/ads/Ql;J)Lcom/google/android/gms/internal/ads/Ql;

    iget-object p1, p2, Lcom/google/android/gms/internal/ads/Ql;->a:Ljava/lang/Object;

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/DH0;->c:Ljava/lang/Object;

    invoke-static {p1, p3}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Lcom/google/android/gms/internal/ads/Ql;->o:Ljava/lang/Object;

    iput-object p1, p2, Lcom/google/android/gms/internal/ads/Ql;->a:Ljava/lang/Object;

    :cond_0
    return-object p2
.end method

.method public final f(I)Ljava/lang/Object;
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/yH0;->b:Lcom/google/android/gms/internal/ads/qm;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/qm;->f(I)Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/DH0;->d:Ljava/lang/Object;

    invoke-static {p1, v0}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, Lcom/google/android/gms/internal/ads/DH0;->e:Ljava/lang/Object;

    :cond_0
    return-object p1
.end method

.method public final p(Lcom/google/android/gms/internal/ads/qm;)Lcom/google/android/gms/internal/ads/DH0;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/DH0;->c:Ljava/lang/Object;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/DH0;->d:Ljava/lang/Object;

    new-instance v2, Lcom/google/android/gms/internal/ads/DH0;

    invoke-direct {v2, p1, v0, v1}, Lcom/google/android/gms/internal/ads/DH0;-><init>(Lcom/google/android/gms/internal/ads/qm;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v2
.end method
