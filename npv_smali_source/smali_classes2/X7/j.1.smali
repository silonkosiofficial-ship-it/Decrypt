.class public final LX7/j;
.super Lu8/c;
.source "SourceFile"


# instance fields
.field private final C:LO7/m;


# direct methods
.method public constructor <init>(LO7/m;)V
    .locals 1

    const-string v0, "target"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lu8/c;-><init>()V

    iput-object p1, p0, LX7/j;->C:LO7/m;

    return-void
.end method


# virtual methods
.method public g()Lu8/b;
    .locals 1

    sget-object v0, Lu8/b;->D:Lu8/b;

    return-object v0
.end method
