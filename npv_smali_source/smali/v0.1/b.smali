.class public abstract Lv0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lv0/b$a;
    }
.end annotation


# static fields
.field public static final a:Lv0/b$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lv0/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lv0/b$a;-><init>(Ly7/k;)V

    sput-object v0, Lv0/b;->a:Lv0/b$a;

    return-void
.end method

.method public static a(I)I
    .locals 0

    return p0
.end method

.method public static final b(II)Z
    .locals 0

    .prologue
    if-ne p0, p1, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method
