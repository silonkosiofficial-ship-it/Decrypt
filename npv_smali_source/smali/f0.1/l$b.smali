.class public final Lf0/l$b;
.super Lf0/l;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf0/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field public static final a:Lf0/l$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lf0/l$b;

    invoke-direct {v0}, Lf0/l$b;-><init>()V

    sput-object v0, Lf0/l$b;->a:Lf0/l$b;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lf0/l;-><init>(Ly7/k;)V

    return-void
.end method
