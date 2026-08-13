.class final LH/b$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LJ/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LH/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LH/b$h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LH/b$h;

    invoke-direct {v0}, LH/b$h;-><init>()V

    sput-object v0, LH/b$h;->a:LH/b$h;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
