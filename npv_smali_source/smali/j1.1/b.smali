.class public abstract Lj1/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lj1/b$a;,
        Lj1/b$b;,
        Lj1/b$c;,
        Lj1/b$d;
    }
.end annotation


# static fields
.field public static final a:Lj1/b$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lj1/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lj1/b$a;-><init>(Ly7/k;)V

    sput-object v0, Lj1/b;->a:Lj1/b$a;

    return-void
.end method
