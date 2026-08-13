.class public abstract LV/w;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LV/M1;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(Lx7/a;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LV/f0;

    invoke-direct {v0, p1}, LV/f0;-><init>(Lx7/a;)V

    iput-object v0, p0, LV/w;->a:LV/M1;

    return-void
.end method

.method public synthetic constructor <init>(Lx7/a;Ly7/k;)V
    .locals 0

    invoke-direct {p0, p1}, LV/w;-><init>(Lx7/a;)V

    return-void
.end method


# virtual methods
.method public a()LV/M1;
    .locals 1

    iget-object v0, p0, LV/w;->a:LV/M1;

    return-object v0
.end method

.method public abstract b(LV/P0;LV/M1;)LV/M1;
.end method
