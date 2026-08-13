.class public abstract Lo0/n0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo0/n0$a;
    }
.end annotation


# static fields
.field public static final b:Lo0/n0$a;


# instance fields
.field private final a:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lo0/n0$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo0/n0$a;-><init>(Ly7/k;)V

    sput-object v0, Lo0/n0;->b:Lo0/n0$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Ln0/m;->b:Ln0/m$a;

    invoke-virtual {v0}, Ln0/m$a;->a()J

    move-result-wide v0

    iput-wide v0, p0, Lo0/n0;->a:J

    return-void
.end method

.method public synthetic constructor <init>(Ly7/k;)V
    .locals 0

    invoke-direct {p0}, Lo0/n0;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a(JLo0/N1;F)V
.end method
