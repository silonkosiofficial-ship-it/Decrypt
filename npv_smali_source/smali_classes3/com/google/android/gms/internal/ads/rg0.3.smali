.class final Lcom/google/android/gms/internal/ads/rg0;
.super Lcom/google/android/gms/internal/ads/ng0;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field private final C:Ljava/util/regex/Pattern;


# direct methods
.method constructor <init>(Ljava/util/regex/Pattern;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/ng0;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/rg0;->C:Ljava/util/regex/Pattern;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/CharSequence;)Lcom/google/android/gms/internal/ads/lg0;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/rg0;->C:Ljava/util/regex/Pattern;

    new-instance v1, Lcom/google/android/gms/internal/ads/qg0;

    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p1

    invoke-direct {v1, p1}, Lcom/google/android/gms/internal/ads/qg0;-><init>(Ljava/util/regex/Matcher;)V

    return-object v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/rg0;->C:Ljava/util/regex/Pattern;

    invoke-virtual {v0}, Ljava/util/regex/Pattern;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
