.class public final LS5/s;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LS5/s$a;
    }
.end annotation


# static fields
.field public static final c:LS5/s$a;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LS5/s$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LS5/s$a;-><init>(Ly7/k;)V

    sput-object v0, LS5/s;->c:LS5/s$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LS5/s;->a:Ljava/lang/String;

    iput-object p2, p0, LS5/s;->b:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ly7/k;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LS5/s;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LS5/s;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LS5/s;->a:Ljava/lang/String;

    return-object v0
.end method
