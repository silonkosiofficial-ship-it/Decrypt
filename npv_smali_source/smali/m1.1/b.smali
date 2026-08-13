.class public abstract Lm1/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm1/b$a;
    }
.end annotation


# static fields
.field public static final a:Lm1/b$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lm1/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lm1/b$a;-><init>(Ly7/k;)V

    sput-object v0, Lm1/b;->a:Lm1/b$a;

    return-void
.end method
