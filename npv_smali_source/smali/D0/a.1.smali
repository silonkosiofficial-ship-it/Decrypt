.class public abstract LD0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LD0/a$a;
    }
.end annotation


# static fields
.field public static final b:LD0/a$a;


# instance fields
.field private final a:Lx7/p;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LD0/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LD0/a$a;-><init>(Ly7/k;)V

    sput-object v0, LD0/a;->b:LD0/a$a;

    return-void
.end method

.method private constructor <init>(Lx7/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LD0/a;->a:Lx7/p;

    return-void
.end method

.method public synthetic constructor <init>(Lx7/p;Ly7/k;)V
    .locals 0

    invoke-direct {p0, p1}, LD0/a;-><init>(Lx7/p;)V

    return-void
.end method


# virtual methods
.method public final a()Lx7/p;
    .locals 1

    iget-object v0, p0, LD0/a;->a:Lx7/p;

    return-object v0
.end method
