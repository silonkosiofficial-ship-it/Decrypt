.class public final Lu/C0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu/t;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lu/C0;->c(Lu/r;FF)Lu/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private final a:Lu/N;


# direct methods
.method constructor <init>(FF)V
    .locals 7

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v6, Lu/N;

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v0, v6

    move v1, p1

    move v2, p2

    invoke-direct/range {v0 .. v5}, Lu/N;-><init>(FFFILy7/k;)V

    iput-object v6, p0, Lu/C0$b;->a:Lu/N;

    return-void
.end method


# virtual methods
.method public a(I)Lu/N;
    .locals 0

    iget-object p1, p0, Lu/C0$b;->a:Lu/N;

    return-object p1
.end method

.method public bridge synthetic get(I)Lu/K;
    .locals 0

    invoke-virtual {p0, p1}, Lu/C0$b;->a(I)Lu/N;

    move-result-object p1

    return-object p1
.end method
