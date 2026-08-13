.class public abstract LE0/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lx7/a;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(Lx7/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LE0/c;->a:Lx7/a;

    return-void
.end method

.method public synthetic constructor <init>(Lx7/a;Ly7/k;)V
    .locals 0

    invoke-direct {p0, p1}, LE0/c;-><init>(Lx7/a;)V

    return-void
.end method


# virtual methods
.method public final a()Lx7/a;
    .locals 1

    iget-object v0, p0, LE0/c;->a:Lx7/a;

    return-object v0
.end method
