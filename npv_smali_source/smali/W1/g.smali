.class public abstract LW1/g;
.super Ljava/lang/RuntimeException;
.source "SourceFile"


# instance fields
.field private final C:Landroidx/fragment/app/f;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/f;Ljava/lang/String;)V
    .locals 1

    const-string v0, "fragment"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, LW1/g;->C:Landroidx/fragment/app/f;

    return-void
.end method


# virtual methods
.method public final a()Landroidx/fragment/app/f;
    .locals 1

    iget-object v0, p0, LW1/g;->C:Landroidx/fragment/app/f;

    return-object v0
.end method
