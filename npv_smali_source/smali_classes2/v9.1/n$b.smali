.class public final Lv9/n$b;
.super Lv9/n;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv9/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field public static final a:Lv9/n$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lv9/n$b;

    invoke-direct {v0}, Lv9/n$b;-><init>()V

    sput-object v0, Lv9/n$b;->a:Lv9/n$b;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lv9/n;-><init>(Ly7/k;)V

    return-void
.end method
