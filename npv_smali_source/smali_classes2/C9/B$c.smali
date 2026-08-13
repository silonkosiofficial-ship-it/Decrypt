.class public final LC9/B$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LC9/B;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LC9/B;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# static fields
.field public static final a:LC9/B$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LC9/B$c;

    invoke-direct {v0}, LC9/B$c;-><init>()V

    sput-object v0, LC9/B$c;->a:LC9/B$c;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
