.class public final Lm9/g$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm9/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm9/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field public static final a:Lm9/g$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lm9/g$b;

    invoke-direct {v0}, Lm9/g$b;-><init>()V

    sput-object v0, Lm9/g$b;->a:Lm9/g$b;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    const-string v0, "expected an Int value"

    return-object v0
.end method
